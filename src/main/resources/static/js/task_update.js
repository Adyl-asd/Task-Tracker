$(document).ready(function () {
    const updateButton = $('#update-button');
    updateButton.on('click', function (e) {
        // Check if all inputs are full before ajax request
        if (!$('#inputName').val() || !$('#inputDescription').val() || !$('#inputStatus').val() || !$('#inputPriority').val()) {
            alert('Filling all fields is required!')
        } else {
            // Prevents multiple button clicks firing new events
            e.stopImmediatePropagation();
            e.preventDefault();
            $.ajax({
                url : `/api/task/${$('#inputTaskId').val()}`,
                type : 'PUT',
                data : {
                    name : $('#inputName').val(),
                    description : $('#inputDescription').val(),
                    priority : $('#inputPriority').val(),
                    status : $('#inputStatus').val()
                }
            }).done(function (response) {
                let taskId = response.id
                let projectId = response.projectId;
                window.location.href = `/project/${projectId}/task/${taskId}`;
            })
        }
    })
});