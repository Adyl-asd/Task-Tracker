$(document).ready(function () {
    const deleteButton = $('#delete-button');
    deleteButton.on('click', function () {
        $.ajax({
            url : `/api/project/${$('#inputId').val()}`,
            type : 'DELETE',
        }).done(function () {
            window.location.href = '/';
        })
    })
});