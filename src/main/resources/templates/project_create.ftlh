<#import "partials/main.ftlh" as main/>

<@main.renderWith title="New Project">
    <div class="container mt-3">
        <form>
            <div class="mb-3">
                <label for="inputName" class="form-label">Name</label>
                <input type="text" class="form-control" id="inputName">
            </div>
            <div class="mb-3">
                <label for="inputStartDate" class="form-label">Start Date</label>
                <input type="date" class="form-control" id="inputStartDate">
            </div>
            <div class="mb-3">
                <label for="inputEndDate" class="form-label">End Date</label>
                <input type="date" class="form-control" id="inputEndDate">
            </div>
            <div class="mb-3">
                <label for="inputPriority" class="form-label">Priority</label>
                <select class="form-select" id="inputPriority">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary">Create</button>
        </form>
    </div>
</@main.renderWith>