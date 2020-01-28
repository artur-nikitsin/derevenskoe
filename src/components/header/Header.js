import React, {Component} from 'react';
import HeaderTop from "./HeaderTop";
import HeaderMenu from "./HeaderMenu";
import CategoriesMenu from "./CategoriesMenu";
import "./styles/header.scss"

class Header extends Component {

    constructor(props) {
        super(props);
        this.handleScroll = this.handleScroll.bind(this);
        this.state = {
            scrolled: false,
            offsetTop: 0,
            mobileWidth: false
        };
    }

    handleScroll = () => {
        if (!this.state.mobileWidth) {
            if (window.scrollY >= 80) {
                this.setState({scrolled: true});
            }
            if (window.scrollY <= 80) {
                this.setState({scrolled: false});
            }
        }
        if (this.state.mobileWidth) {
            if (window.scrollY >= 0) {
                this.setState({scrolled: true});
            }
            if (window.scrollY <= 0) {
                this.setState({scrolled: false});
            }
        }


    };

    handleResize = () => {
        if (window.innerWidth <= 760) {
            this.setState({mobileWidth: true});

        }
        if (window.innerWidth >= 760) {
            this.setState({mobileWidth: false});

        }
    };

    componentDidMount = () => {
        window.addEventListener('scroll', this.handleScroll, true);
        window.addEventListener('resize', this.handleResize, true);
        this.handleResize();
    };
    componentWillUnmount = () => {
        window.removeEventListener('scroll', this.handleScroll);
        window.removeEventListener('resize', this.handleResize, true);
    };


    render() {

        return (
            <div className={this.state.scrolled ? "Header scrolled" : "Header"}>
                <HeaderTop scrolled={this.state.scrolled}
                           mobileWidth={this.state.mobileWidth}/>
                <HeaderMenu scrolled={this.state.scrolled}
                            mobileWidth={this.state.mobileWidth}/>
                {/* <CategoriesMenu scrolled={this.state.scrolled}/>*/}
            </div>
        );
    }
}

export default Header;