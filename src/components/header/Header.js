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
            offsetTop: 0
        };
    }

    handleScroll = () => {
        if (window.scrollY >= 100) {
            this.setState({scrolled: true});
        }
        if (window.scrollY <= 100) {
            this.setState({scrolled: false});
            console.log(this.state);
        }
    };

    componentDidMount = () => {
        window.addEventListener('scroll', this.handleScroll, true);
    };
    componentWillUnmount = () => {
        window.removeEventListener('scroll', this.handleScroll);
    };


    render() {

        return (
            <div className={this.state.scrolled ? "Header scrolled" : "Header"}>
                <HeaderTop scrolled={this.state.scrolled}/>
                <HeaderMenu scrolled={this.state.scrolled}/>
               {/* <CategoriesMenu scrolled={this.state.scrolled}/>*/}
            </div>
        );
    }
}

export default Header;