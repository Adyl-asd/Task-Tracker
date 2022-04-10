<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Edit Project" scripts=["js/project_update.js"]>
    <div class="container mt-3">
        <form>
            <input type="hidden" id="inputId" value="${project.id}">
            <div class="mb-3">
                <label for="inputName" class="form-label">Name</label>
                <input type="text" class="form-control" id="inputName" value="${project.name}">
            </div>
            <div class="mb-3">
                <label for="inputStartDate" class="form-label">Start Date</label>
                <input type="date" class="form-control" id="inputStartDate" value="${project.startDate}">
            </div>
            <div class="mb-3">
                <label for="inputEndDate" class="form-label">End Date</label>
                <input type="date" class="form-control" id="inputEndDate" value="${project.endDate}">
            </div>
            <div class="mb-3">
                <label for="inputStatus" class="form-label">Status</label>
                <select class="form-select" id="inputStatus">
                    <option selected value="${project.status}">${project.status.getName()}</option>
                    <#list statuses as s>
                        <option value="${s}">${s.getName()}</option>
                    </#list>
                </select>
            </div>
            <div class="mb-3">
                <label for="inputPriority" class="form-label">Priority</label>
                <select class="form-select" id="inputPriority">
                    <option selected value="${project.priority}">${project.priority}</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </div>
        </form>
        <button id="update-button" class="btn btn-primary">Update</button>
    </div>
</@main.renderWith>