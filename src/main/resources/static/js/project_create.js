$(document).ready(function () {
    const createButton = $('#create-button');
    createButton.on('click', function () {
        if (!$('#inputName').val() || !$('#inputStartDate').val() || !$('#inputEndDate').val() || !$('#inputPriority').val()) {
            alert('Filling all fields is required!')
        } else {
            $.ajax({
                url : '/api/project',
                type : 'POST',
                data : {
                    name : $('#inputName').val(),
                    startDate : $('#inputStartDate').val(),
                    endDate : $('#inputEndDate').val(),
                    priority : $('#inputPriority').val()
                }
            }).done(function (response) {
                let projectId = response.id;
                window.location.href = `/project/${projectId}`;
            })
        }
    })
});