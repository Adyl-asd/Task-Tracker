<#import "partials/main.ftlh" as main/>

<@main.renderWith title="New Project" scripts=["js/project_create.js"]>
    <div class="container mt-3">
        <form id="project-form">
            <div class="mb-3">
                <label for="inputName" class="form-label">Name</label>
                <input type="text" class="form-control" id="inputName" name="inputName">
            </div>
            <div class="mb-3">
                <label for="inputStartDate" class="form-label">Start Date</label>
                <input type="date" class="form-control" id="inputStartDate" name="inputStartDate">
            </div>
            <div class="mb-3">
                <label for="inputEndDate" class="form-label">End Date</label>
                <input type="date" class="form-control" id="inputEndDate" name="inputEndDate">
            </div>
            <div class="mb-3">
                <label for="inputPriority" class="form-label">Priority</label>
                <select class="form-select" id="inputPriority" name="inputPriority">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </div>
        </form>
        <button id="create-button" class="btn btn-primary">Create</button>
    </div>
</@main.renderWith>