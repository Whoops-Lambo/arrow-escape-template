package com.unity3d.player;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import io.p071bidmachine.Framework;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class UnityPlayerActivity extends Activity implements IUnityPlayerLifecycleEvents, IUnityPermissionRequestSupport, IUnityPlayerSupport {
    public static final /* synthetic */ int a = 0;
    protected UnityPlayerForActivityOrService mUnityPlayer;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getIntent().putExtra(Framework.UNITY, updateUnityCommandLineArguments(getIntent().getStringExtra(Framework.UNITY)));
        UnityPlayerForActivityOrService unityPlayerForActivityOrService = new UnityPlayerForActivityOrService(this, this);
        this.mUnityPlayer = unityPlayerForActivityOrService;
        setContentView(unityPlayerForActivityOrService.getFrameLayout());
        this.mUnityPlayer.getFrameLayout().requestFocus();
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
        moveTaskToBack(true);
    }

    public String updateUnityCommandLineArguments(String str) {
        return str;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.mUnityPlayer.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return this.mUnityPlayer.getFrameLayout().onGenericMotionEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.mUnityPlayer.getFrameLayout().onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.mUnityPlayer.getFrameLayout().onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mUnityPlayer.getFrameLayout().onTouchEvent(motionEvent);
    }

    @Override // com.unity3d.player.IUnityPermissionRequestSupport
    @TargetApi(23)
    public void requestPermissions(PermissionRequest permissionRequest) {
        this.mUnityPlayer.addPermissionRequest(permissionRequest);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 2) {
            return this.mUnityPlayer.injectEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mUnityPlayer.configurationChanged(configuration);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mUnityPlayer.onTrimMemory(UnityPlayerForActivityOrService.MemoryUsage.Critical);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        setIntent(intent);
        this.mUnityPlayer.newIntent(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mUnityPlayer.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.mUnityPlayer.permissionResponse(this, i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.mUnityPlayer.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.mUnityPlayer.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mUnityPlayer.onStop();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i != 5) {
            if (i != 10) {
                if (i != 15) {
                    return;
                }
                this.mUnityPlayer.onTrimMemory(UnityPlayerForActivityOrService.MemoryUsage.Critical);
                return;
            }
            this.mUnityPlayer.onTrimMemory(UnityPlayerForActivityOrService.MemoryUsage.High);
            return;
        }
        this.mUnityPlayer.onTrimMemory(UnityPlayerForActivityOrService.MemoryUsage.Medium);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.mUnityPlayer.windowFocusChanged(z);
    }

    @Override // com.unity3d.player.IUnityPlayerSupport
    public UnityPlayerForActivityOrService getUnityPlayerConnection() {
        return this.mUnityPlayer;
    }
}
