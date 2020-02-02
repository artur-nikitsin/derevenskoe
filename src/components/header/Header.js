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
            mobileWidth: false
        };
    }



    render() {

        return (
            <div className={this.state.scrolled ? "Header scrolled" : "Header"}>
                {/*<HeaderTop scrolled={this.state.scrolled}
                           mobileWidth={this.state.mobileWidth}/>*/}
               {/* <HeaderMenu scrolled={this.state.scrolled}
                            mobileWidth={this.state.mobileWidth}/>*/}
                {/* <CategoriesMenu scrolled={this.state.scrolled}/>*/}
            </div>
        );
    }
}

export default Header;