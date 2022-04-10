<#import "partials/main.ftlh" as main/>

<@main.renderWith title="New Task" scripts=["js/task_create.js"]>
    <div class="container mt-3">
        <form>
            <input type="hidden" id="inputProjectId" value="${projectId}">
            <div class="mb-3">
                <label for="inputName" class="form-label">Name</label>
                <input type="text" class="form-control" id="inputName">
            </div>
            <div class="mb-3">
                <label for="inputDescription" class="form-label">Description</label>
                <input type="text" class="form-control" id="inputDescription">
            </div>
            <div class="mb-3">
                <label for="inputPriority" class="form-label">Priority</label>
                <select class="form-select" id="inputPriority">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </div>
        </form>
        <button id="create-button" class="btn btn-primary">Create</button>
    </div>
</@main.renderWith>