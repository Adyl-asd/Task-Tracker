<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Projects">
    <div class="container">
        <a class="btn btn-primary my-3" href="/project/new" role="button">Create New Project</a>
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Start Date</th>
                    <th scope="col">End Date</th>
                    <th scope="col">Status</th>
                    <th scope="col">Priority</th>
                </tr>
                </thead>
                <tbody>
                <#list projects as p>
                <tr>
                    <td><a href="/project/${p.id}">${p.name}</a></td>
                    <td>${p.startDate}</td>
                    <td>${p.endDate}</td>
                    <td>${p.status.getName()}</td>
                    <td>${p.priority}</td>
                </tr>
                </#list>
                </tbody>
            </table>
    </div>
</@main.renderWith>