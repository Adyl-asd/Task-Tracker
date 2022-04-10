<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Delete Project">
    <div class="container mt-3">
        <p class="h2">Are you sure you want to delete ${project.name}</p>
        <a href="/project/${project.id}" type="button" class="btn btn-outline-primary">No</a>
        <button type="button" class="btn btn-outline-danger">Yes</button>
    </div>
</@main.renderWith>