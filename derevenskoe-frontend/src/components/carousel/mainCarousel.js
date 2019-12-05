import React, {Component} from 'react';
import Slider from "react-slick";
import {Container} from '@material-ui/core';
import ArrowBackIosIcon from '@material-ui/icons/ArrowBackIos';
import ArrowForwardIosIcon from '@material-ui/icons/ArrowForwardIos';
import "./styles/carousel.scss"

class MainCarousel extends Component {
    render() {

        function NextArrow(props) {
            const {className, onClick} = props;
            console.log(className);
            return (
                <ArrowForwardIosIcon
                    className={className}
                    onClick={onClick}
                    style={{fontSize: 100}}/>
            );
        }

        function PrevArrow(props) {
            const {className, onClick} = props;
            return (
                <ArrowBackIosIcon
                    className={className}
                    onClick={onClick}
                    style={{fontSize: 100}}/>

            );
        }


        const settings = {
            dots: true,
            infinite: true,
            speed: 500,
            slidesToShow: 1,
            slidesToScroll: 1,
            centerMode: true,
            centerPadding: 200,
            arrows: true,
            nextArrow: <NextArrow/>,
            prevArrow: <PrevArrow/>

        };

        return (
            <Container className={"container"}>
                <Slider {...settings}>
                    <div>
                        <img src="img/10022a-960x400.webp" alt=""/>
                    </div>
                    <div>
                        <img src="img/bbab61-960x400.webp" alt=""/>
                    </div>

                </Slider>
            </Container>
        );
    }
}


export default MainCarousel;