<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Profile">
    <div class="container">
        <#if user??>
            <h1>Your user data!</h1>
            <p>${(user.username)!'-- missing --'} - ${(user.email)!'-- email missing --'}</p>
        <#else>
            <h1>User not found!</h1>
        </#if>
        <form class="flex box-128" action="/logout" method="post">
            <#if _csrf??>
                <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'--no-token--'}"/>
            </#if>
            <button class="flex box-128 logout-button btn btn-primary">Logout</button>
        </form>
        <div class="bottom-box">
            <a href="/" class="btn btn-primary mt-3">Back to main page</a>
        </div>
    </div>
</@main.renderWith>