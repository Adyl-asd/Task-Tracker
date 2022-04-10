$(document).ready(function () {
    const createButton = $('#create-button');
    createButton.on('click', function (e) {
        // Check if all inputs are full before ajax request
        if (!$('#inputName').val() || !$('#inputDescription').val() || !$('#inputProjectId').val() || !$('#inputPriority').val()) {
            alert('Filling all fields is required!')
        } if ($('#inputPriority').val() > 3 || $('#inputPriority').val() < 1) {
            alert('Priority can be only from 1 to 3')
        }
        else {
            // Prevents multiple button clicks firing new events
            e.stopImmediatePropagation();
            e.preventDefault();
            $.ajax({
                url : '/api/task',
                type : 'POST',
                data : {
                    name : $('#inputName').val(),
                    description : $('#inputDescription').val(),
                    priority : $('#inputPriority').val(),
                    projectId : $('#inputProjectId').val()
                }
            }).done(function (response) {
                let taskId = response.id
                let projectId = response.projectId;
                window.location.href = `/project/${projectId}/task/${taskId}`;
            })
        }
    })
});