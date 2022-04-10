$(document).ready(function () {
    const updateButton = $('#update-button');
    updateButton.on('click', function (e) {
        // Check if all inputs are full before ajax request
        if (!$('#inputName').val() || !$('#inputStartDate').val() || !$('#inputEndDate').val() || !$('#inputPriority').val() || !$('#inputStatus').val()) {
            alert('Filling all fields is required!')
        } else {
            // Prevents multiple button clicks firing new events
            e.stopImmediatePropagation();
            e.preventDefault();
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
        }
    })
});