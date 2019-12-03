import React, {Component} from 'react';
import OwlCarousel from 'react-owl-carousel2';
import ArrowBackIosIcon from '@material-ui/icons/ArrowBackIos';
import ArrowForwardIosIcon from '@material-ui/icons/ArrowForwardIos';

class MainCarousel extends Component {
    render() {
        const options = {
            items: 1,
            nav: true,
            navText: [<ArrowBackIosIcon/>, <ArrowForwardIosIcon/>],
            rewind: true,
            autoplay: true
        };

        return (
            <OwlCarousel ref="car" options={options} >
                <div><img src="img/10022a-960x400.webp" alt="The Last of us"/></div>
                <div><img src="img/bbab61-960x400.webp" alt="The Last of us"/></div>
            </OwlCarousel>
        )

    }
}
export default MainCarousel;