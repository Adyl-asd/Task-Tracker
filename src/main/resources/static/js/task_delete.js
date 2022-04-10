$(document).ready(function () {
    const deleteButton = $('#delete-button');
    deleteButton.on('click', function () {
        $.ajax({
            url : `/api/task/${$('#inputTaskId').val()}`,
            type : 'DELETE'
        }).done(function () {
            let projectId = $('#inputProjectId').val();
            window.location.href = `/project/${projectId}`;
        })
    })
});