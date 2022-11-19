import {
  requireNativeComponent,
  UIManager,
  Platform,
  ViewStyle,
} from 'react-native';

const LINKING_ERROR =
  `The package 'react-native-modern-view' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

type ModernViewProps = {
  color: string;
  style: ViewStyle;
};

const ComponentName = 'ModernViewView';

export const ModernViewView =
  UIManager.getViewManagerConfig(ComponentName) != null
    ? requireNativeComponent<ModernViewProps>(ComponentName)
    : () => {
        throw new Error(LINKING_ERROR);
      };
