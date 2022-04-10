$(document).ready(function () {
    const updateButton = $('#update-button');
    updateButton.on('click', function () {
        $.ajax({
            url : `/api/project/${$('#inputId').val()}`,
            type : 'PUT',
            data : {
                name : $('#inputName').val(),
                startDate : $('#inputStartDate').val(),
                endDate : $('#inputEndDate').val(),
                status : $('#inputStatus').val(),
                priority : $('#inputPriority').val()
            }
        }).done(function (response) {
            let projectId = response.id;
            window.location.href = `/project/${projectId}`;
        })
    })
});