window.onload = function () {
    let xmlHttpRequest = new XMLHttpRequest();

    xmlHttpRequest.onerror = function () {
        console.log('error');
    }

    xmlHttpRequest.onreadystatechange = function () {
        if(this.readyState == 4 && this.status === 200) {
            let user = document.getElementById('user');
            user.innerHTML = this.response.toString();
        }
    }
    xmlHttpRequest.open('GET', '/user', true);
    xmlHttpRequest.send();
}