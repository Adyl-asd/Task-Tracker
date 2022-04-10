<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Task">
    <div class="container mt-3">
        <div class="card mb-3">
            <div class="card-body">
                <h5 class="card-title">${task.name}</h5>
                <p class="card-text">${task.description}</p>
                <p class="card-text"><small class="text-muted">Status: ${task.status.getName()}, Priority: ${task.priority}</small></p>
            </div>
        </div>
        <a class="btn btn-primary" href="/project/${task.project.id}/task/${task.id}/edit" role="button">Edit Task</a>
        <a class="btn btn-danger my-2" href="/project/${task.project.id}/task/${task.id}/delete" role="button">Delete Task</a>
        <a class="btn btn-primary" href="/project/${task.project.id}" role="button">Back to Project</a>
    </div>
</@main.renderWith>