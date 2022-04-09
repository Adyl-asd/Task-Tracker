<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Register">
    <div class="container">
        <h2>Register</h2>
        <div>
            <form action="/register" method="post">
                <#if _csrf??>
                    <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'__no-token__'}">
                </#if>
                <div class="mb-3">
                    <label for="exampleInputName1" class="form-label">Input your name</label>
                    <input type="text" name="name" class="form-control" id="exampleInputName1" value="${(userForm.name)}"
                           aria-describedby="nameHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Input your email address</label>
                    <input type="email" name="email" class="form-control" id="exampleInputEmail1"
                           value="${(userForm.email)}" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Input your password</label>
                    <input type="password" name="password" class="form-control" id="exampleInputPassword1">
                </div>
                <div class="form-row">
                    <input type="submit" class="btn btn-primary" value="Register">
                </div>
                <#if errors??>
                    <p>Incorrect register data</p>
                    <#list errors as fieldError>
                        <p>${fieldError.field} - ${fieldError.defaultMessage!'__no message__'}</p>
                    </#list>
                </#if>
            </form>
        </div>
    </div>
</@main.renderWith>