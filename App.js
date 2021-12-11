import React, {useEffect} from 'react';
import {SafeAreaView, Text, View} from 'react-native';
import RNBootSplash from 'react-native-bootsplash';

const App = () => {
  useEffect(() => {
    setTimeout(() => {
      RNBootSplash.hide({fade: true});
    }, 3000);
  }, []);

  return (
    <SafeAreaView>
      <View>
        <Text>Splash Screen</Text>
      </View>
    </SafeAreaView>
  );
};

export default App;
