

export const Menu = () => {
    return <div>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Logo</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="Home">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Book">Book</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Contact">Contact Us</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Login">Login</a>
                        </li>
                        
                    </ul>
                </div>
            </div>
        </nav>

    </div>
}