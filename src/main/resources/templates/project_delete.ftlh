<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Delete Project" scripts=["js/project_delete.js"]>
    <div class="container mt-3">
        <input type="hidden" id="inputId" value="${project.id}">
        <p class="h2">Are you sure you want to delete ${project.name}</p>
        <a href="/project/${project.id}" type="button" class="btn btn-outline-primary">No</a>
        <button type="button" id="delete-button" class="btn btn-outline-danger">Yes</button>
    </div>
</@main.renderWith>