<#macro renderWith title="" scripts=["js/main.js"] styles=[]>
    <!doctype html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <base href="/">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
              crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
                crossorigin="anonymous"></script>
        <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/main.css">
        <#list styles as styles>
            <link rel="stylesheet" href="${styles}">
        </#list>
        <title>Task Tracker</title>
    </head>
    <body>


    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="/">Task Tracker</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="/">Home</a>
                    </li>
                    <#if user??>
                        <li class="nav-item">
                            <a class="nav-link" href="/establishment/add">Create Project</a>
                        </li>
                    </#if>
                </ul>

                <#if user??>
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 d-flex">
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="/profile">${user.email}</a>
                        </li>
                        <li class="nav-item">
                            <form class="flex box-128" action="/logout" method="post">
                                <#if _csrf??>
                                    <input type="hidden" name="${(_csrf.parameterName)!'csrf'}"
                                           value="${(_csrf.token)!'--no-token--'}"/>
                                </#if>
                                <button class="btn btn-outline-danger">Logout</button>
                            </form>
                        </li>
                    </ul>
                <#else>
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 d-flex">
                        <li class="nav-item">
                            <a class="nav-link" href="/login">Sign In</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="/register">Sign Up</a>
                        </li>
                    </ul>
                </#if>
            </div>
        </div>
    </nav>

    <#nested>

    <footer class="bg-dark text-center text-white mt-3">
        <div class="text-center p-3">
            © 2022 Copyright:
            <a class="text-white" href="https://mdbootstrap.com/">getbootstrap.com</a>
        </div>
    </footer>

    <script src="js/bootstrap.bundle.min.js"></script>
    <#list scripts as scripts>
        <script src="${scripts}"></script>
    </#list>
    </body>
    </html>
</#macro>