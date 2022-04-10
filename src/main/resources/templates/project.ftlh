<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Project">
    <div class="container mt-3">
        <div class="card mb-3">
            <div class="card-body">
                <h5 class="card-title">${project.name}</h5>
                <p class="card-text">Status: ${project.status.getName()}</p>
                <p class="card-text">Priority: ${project.priority}</p>
                <p class="card-text"><small class="text-muted">Start Date: ${project.startDate}, End Date: ${project.endDate}</small></p>
            </div>
        </div>

        <table class="table">
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Status</th>
                <th scope="col">Priority</th>
            </tr>
            </thead>
            <tbody>
            <#list project.tasks as t>
                <tr>
                    <td><a href="/project/${project.id}/task/${t.id}">${t.name}</a></td>
                    <td>${t.status.getName()}</td>
                    <td>${t.priority}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</@main.renderWith>