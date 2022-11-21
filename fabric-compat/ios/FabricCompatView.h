// This guard prevent this file to be compiled in the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
#import <React/RCTViewComponentView.h>
#import <UIKit/UIKit.h>

#ifndef FabricCompatViewNativeComponent_h
#define FabricCompatViewNativeComponent_h

NS_ASSUME_NONNULL_BEGIN

@interface FabricCompatView : RCTViewComponentView
@end

NS_ASSUME_NONNULL_END

#endif /* FabricCompatViewNativeComponent_h */
#endif /* RCT_NEW_ARCH_ENABLED */
