

var { requireNativeComponent, PropTypes } = require('react-native');

var iface = {
  name: 'BozoWebView',
  propTypes: {
    src: PropTypes.string,
   
	
  },
};

module.exports = requireNativeComponent('BozoWebView', iface);