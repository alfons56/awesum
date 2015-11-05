/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 */
'use strict';

var React = require('react-native');
var {
  AppRegistry,
  StyleSheet,
  Text,
  View,
} = React;
var ToastAndroid2 = require('./modules/ToastAndroid2');
var BozoImageView = require('./modules/BozoImageView');
var BozoWebView = require('./modules/BozoWebView');
var WebviewExample = require('./webview');

var AwesomeProject = React.createClass({
  
  componentDidMount: function() {
  
    ToastAndroid2.show('Awesome', ToastAndroid2.LONG);
  },

  render: function() {
//    return WebviewExample.examples[0].render();
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Welcome to React Native!
        </Text>
        <Text style={styles.instructions}>
          To get started, edit index.android.js
        </Text>
        <Text style={styles.instructions}>
          Shake or press menu button for dev menu
        </Text>
		<BozoWebView 
			style={styles.image}
			src={"http://www.majorgeeks.com/"} 
			
		/>
      </View>
    );
  }
});

var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
  image: {
    width: 300,
	height: 100,
  },
});

AppRegistry.registerComponent('AwesomeProject', () => AwesomeProject);




