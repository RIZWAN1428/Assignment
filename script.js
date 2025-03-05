function addTask() {
    let taskInput = document.getElementById("taskInput");
    let taskText = taskInput.value.trim();

    if (taskText === "") {
        alert("Please enter a task!");
        return;
    }

    let taskList = document.getElementById("taskList");
    let li = document.createElement("li");
    li.innerHTML = taskText + ' <button onclick="removeTask(this)">Remove</button>';
    taskList.appendChild(li);

    taskInput.value = ""; // Clear input box
}

function removeTask(button) {
    let li = button.parentElement;
    li.remove();
}
