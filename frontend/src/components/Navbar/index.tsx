import { ReactComponent as GithubIcon } from "../../assets/img/Github.svg";
import './styles.css'

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="ssmovie-nav-content">
          <h1>SSMovie</h1>
          <a href="https://github.com/ssotter">
            <div className="ssmovie-contact-container">
              <GithubIcon />
              <p className="ssmovie-contact-link">/ssotter</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
