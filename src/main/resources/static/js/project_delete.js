$(document).ready(function () {
    const deleteButton = $('#delete-button');
    deleteButton.on('click', function (e) {
        // Prevents multiple button clicks firing new events
        e.stopImmediatePropagation();
        e.preventDefault();
        $.ajax({
            url : `/api/project/${$('#inputId').val()}`,
            type : 'DELETE',
        }).done(function () {
            window.location.href = '/';
        })
    })
});