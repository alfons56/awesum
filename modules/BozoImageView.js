

var { requireNativeComponent, PropTypes } = require('react-native');

var iface = {
  name: 'BozoImageView',
  propTypes: {
    src: PropTypes.string,
    borderRadius: PropTypes.number,
    resizeMode: PropTypes.oneOf(['cover', 'contain', 'stretch']),
	scaleX: PropTypes.number,
	scaleY: PropTypes.number,
	translateX: PropTypes.number,
	translateY: PropTypes.number,
	rotation: PropTypes.number,
	
  },
};

module.exports = requireNativeComponent('BozoImageView', iface);