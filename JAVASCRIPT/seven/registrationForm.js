// Array to hold the form data as objects
let formDataArray = [];

// Get references to the form and the list where we display data
const form = document.getElementById('userForm');
const dataList = document.getElementById('dataList');

// Function to capture form data and store it in the array
form.addEventListener('submit', function(event) {
  event.preventDefault(); // Prevent the form from refreshing the page

  // Create a new object with form data
  const formData = {
    firstName: document.getElementById('first').value,
    lastName: document.getElementById('last').value,
    email: document.getElementById('email').value,
    password: document.getElementById('password').value,
    mobile: document.getElementById('mobile').value,
    gender: document.getElementById('gender').value
  };

  // Add the object to the array
  formDataArray.push(formData);

  // Call function to update the displayed data
  displayFormData();
});

// Function to update the displayed data in HTML
function displayFormData() {
  // Clear existing data
  dataList.innerHTML = '';

  // Iterate over the array and create list items for each object
  formDataArray.forEach((item, index) => {
    const listItem = document.createElement('li');
    listItem.textContent = `Name: ${item.firstName}, Email: ${item.email}`;
    dataList.appendChild(listItem);
  });
}
