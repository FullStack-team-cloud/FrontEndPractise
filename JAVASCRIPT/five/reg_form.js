let EmptyArray = [];

const form = document.getElementById('Arithmetic operations');
const dataList = document.getElementById('dataList');

form.addEventListener('submit', function(event) {
event.preventDefault();

const formData = {
    firstName: document.getElementById('fn').value,
    lastName: document.getElementById('ln').value,
    Dob: document.getElementById('dob').value,
    phone: document.getElementById('phone').value,
    email: document.getElementById('email').value,
    gender: document.getElementById('gender').value,
    address: document.getElementById('add').value,
    job_title: document.getElementById('jt').value,
    resume: document.getElementById('file').value,
};

EmptyArray.push(formData);

displayFormData();
});

function displayFormData() {

dataList.innerHTML = '';

EmptyArray.forEach((item, index) => {
    const listItem = document.createElement('li');
    listItem.textContent = `Name: ${item.firstName}, Email: ${item.email}`;
    dataList.appendChild(listItem);
});
}
    