<#import "partials/main.ftlh" as main/>

<@main.renderWith title="Login">
    <div class="container">
        <h2>Please sign in</h2>
        <form action="/login" method="post">

            <div>
                <#if error!false >
                    <p style="color:red">Wrong email or password!</p>
                </#if>
            </div>

            <#if _csrf??>
                <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'--no-token--'}"/>
            </#if>

            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Email address</label>
                <input type="email" name="username" class="form-control" id="exampleInputEmail1" value="${(user.email)!''}" autofocus >
                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input type="password" name="password" class="form-control" id="exampleInputPassword1" value="">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        <div class="bottom-box">
            <a href="/" class="btn btn-primary mt-3">Back to main page</a>
        </div>
    </div>
</@main.renderWith>