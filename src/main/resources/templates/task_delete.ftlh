<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Delete Task" scripts=["js/task_delete.js"]>
    <div class="container mt-3">
        <input type="hidden" id="inputProjectId" value="${projectId}">
        <input type="hidden" id="inputTaskId" value="${task.id}">
        <p class="h2">Are you sure you want to delete ${task.name}</p>
        <a href="/project/${projectId}/task/${task.id}" type="button" class="btn btn-outline-primary">No</a>
        <button type="button" id="delete-button" class="btn btn-outline-danger">Yes</button>
    </div>
</@main.renderWith>