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
    </div>
</@main.renderWith>