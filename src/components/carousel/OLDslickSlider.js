/*import React, {Component} from 'react';
import Slider from "react-slick";
import {Container} from '@material-ui/core';
import ArrowBackIosIcon from '@material-ui/icons/ArrowBackIos';
import ArrowForwardIosIcon from '@material-ui/icons/ArrowForwardIos';
import Grid from '@material-ui/core/Grid';
import "./styles/carousel.scss"

class MainCarousel extends Component {

    render() {


        function NextArrow(props) {
            const {className, onClick} = props;

            return (
                <ArrowForwardIosIcon
                    className={className}
                    onClick={onClick}
                    style={{fontSize: 50}}/>
            );
        }

        function PrevArrow(props) {
            const {className, onClick} = props;
            return (
                <ArrowBackIosIcon
                    className={className}
                    onClick={onClick}
                    style={{fontSize: 50}}/>

            );
        }


        const settings = {
            dots: true,
            infinite: false,
            speed: 500,
            arrows: true,
            initialSlide: 0,
            responsive: [
                {
                    breakpoint: 1024,
                    settings: {
                        slidesToShow: 3,
                        slidesToScroll: 3,
                        infinite: false,
                        dots: true
                    }
                },
                {
                    breakpoint: 600,
                    settings: {
                        slidesToShow: 2,
                        slidesToScroll: 2,
                        initialSlide: 2,
                        infinite: false
                    }
                },
                {
                    breakpoint: 480,
                    settings: {
                        slidesToShow: 1,
                        slidesToScroll: 1,
                        infinite: false,
                        arrows: false
                    }
                }
            ],

            nextArrow: <NextArrow/>,
            prevArrow: <PrevArrow/>

        };

        /!*TODO:    realize images requiring from components folders  *!/

        return (
            <Container>
                <Slider  {...settings} className={"slideWrapper"}>

                    <img src="assets/caroucel/10022a-960x400.webp" alt=""/>


                    <img src="assets/caroucel/bbab61-960x400.webp" alt=""/>


                    <img src="assets/caroucel/bbab61-960x400.webp" alt=""/>


                    <img src="assets/caroucel/bbab61-960x400.webp" alt=""/>

                </Slider>
            </Container>
        );
    }
}


export default MainCarousel;*/

