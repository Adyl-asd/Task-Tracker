$(document).ready(function () {
    const createButton = $('#create-button');
    createButton.on('click', function () {
        if (!$('#inputName').val() || !$('#inputDescription').val() || !$('#inputProjectId').val() || !$('#inputPriority').val()) {
            alert('Filling all fields is required!')
        } else {
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