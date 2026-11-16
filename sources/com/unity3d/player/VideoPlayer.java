package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.MediaController;
import defpackage.h50;
import defpackage.hi3;
import defpackage.jc1;
import defpackage.mi3;
import defpackage.n30;
import defpackage.nj;
import defpackage.pv1;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class VideoPlayer extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {
    private static final int CTRL_CANCELONTOUCH = 2;
    private static final int CTRL_FULL = 0;
    private static final int CTRL_HIDDEN = 3;
    private static final int CTRL_MINIMAL = 1;
    private static boolean LOG = false;
    private static final String LOGTAG = "Video";
    public static final int PLAYBACK_DONE = 3;
    public static final int PLAYBACK_FAILED = 2;
    public static final int PLAYBACK_STARTED = 1;
    public static final int PLAYBACK_STARTING = 0;
    private static final int SCALE_ASPECTFILL = 2;
    private static final int SCALE_ASPECTFIT = 1;
    private static final int SCALE_FILL = 3;
    private static final int SCALE_NONE = 0;
    private Y0 _timeoutThread;
    private int mBufferPercentage;
    private final Context mContext;
    private final int mControlMode;
    private final String mFileName;
    private final FrameLayout mFrameLayout;
    private final boolean mIsURL;
    private boolean mIsVideoReadyToBePlayed;
    private boolean mIsVideoSizeKnown;
    private int mLatestVideoPosition;
    private MediaController mMediaController;
    private MediaPlayer mMediaPlayer;
    private mi3 mOnBackPressedDispatcher;
    private boolean mPlaybackPaused;
    private final int mScalingMode;
    private volatile int mState;
    private X0 mStateCallback;
    private boolean mSurfaceCreated;
    private int mSurfaceHeight;
    private int mSurfaceWidth;
    private int mVideoHeight;
    private final SurfaceHolder mVideoHolder;
    private final long mVideoLength;
    private final long mVideoOffset;
    private final SurfaceView mVideoView;
    private int mVideoWidth;

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    public void cancelOnPrepare() {
        changeState(2);
    }

    public boolean exitOnKeypress(int i, KeyEvent keyEvent) {
        Runnable runnable;
        if (i != 4 && (this.mControlMode != 2 || i == 0 || keyEvent.isSystem())) {
            return false;
        }
        hi3 hi3Var = this.mOnBackPressedDispatcher.a;
        if (hi3Var == null || (runnable = hi3Var.a) == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Log(String str) {
        Log.i(LOGTAG, "VideoPlayer: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeState(int i) {
        this.mState = i;
        X0 x0 = this.mStateCallback;
        if (x0 != null) {
            int i2 = this.mState;
            a1 a1Var = (a1) x0;
            a1Var.a.h.e.lock();
            f1 f1Var = a1Var.a.h;
            f1Var.g = i2;
            if (i2 == 3 && f1Var.i) {
                f1Var.runOnUiThread(new Z0(a1Var));
            }
            if (i2 != 0) {
                a1Var.a.h.d.release();
            }
            a1Var.a.h.e.unlock();
        }
    }

    private void logUsedInTests(String str) {
        if (LOG) {
            Log(str);
        }
    }

    private void pauseMediaPlayer() {
        this.mLatestVideoPosition = this.mMediaPlayer.getCurrentPosition();
        this.mMediaPlayer.pause();
        logUsedInTests("pauseMediaPlayer");
    }

    private void playVideo() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(this.mVideoHolder);
            if (this.mPlaybackPaused) {
                return;
            }
            if (LOG) {
                Log("Resuming playback");
            }
            startMediaPlayer();
            return;
        }
        changeState(0);
        doCleanUp();
        try {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.mMediaPlayer = mediaPlayer2;
            if (this.mIsURL) {
                mediaPlayer2.setDataSource(this.mContext, Uri.parse(this.mFileName));
            } else if (this.mVideoLength != 0) {
                FileInputStream fileInputStream = new FileInputStream(this.mFileName);
                this.mMediaPlayer.setDataSource(fileInputStream.getFD(), this.mVideoOffset, this.mVideoLength);
                fileInputStream.close();
            } else {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenFd = getResources().getAssets().openFd(this.mFileName);
                    this.mMediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused) {
                    FileInputStream fileInputStream2 = new FileInputStream(this.mFileName);
                    this.mMediaPlayer.setDataSource(fileInputStream2.getFD());
                    fileInputStream2.close();
                }
            }
            this.mMediaPlayer.setDisplay(this.mVideoHolder);
            this.mMediaPlayer.setScreenOnWhilePlaying(true);
            this.mMediaPlayer.setOnBufferingUpdateListener(this);
            this.mMediaPlayer.setOnCompletionListener(this);
            this.mMediaPlayer.setOnPreparedListener(this);
            this.mMediaPlayer.setOnVideoSizeChangedListener(this);
            this.mMediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
            this.mMediaPlayer.prepareAsync();
            this._timeoutThread = new Y0(this);
            new Thread(this._timeoutThread).start();
        } catch (Exception e) {
            if (LOG) {
                Log("error: " + e.getMessage() + e);
            }
            changeState(2);
        }
    }

    private void resumeVideoInPauseMode() {
        if (LOG) {
            Log("resumeVideoInPauseMode");
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mSurfaceCreated || this.mLatestVideoPosition < 0) {
            return;
        }
        mediaPlayer.setDisplay(this.mVideoHolder);
        seekToLatestVideoPosition();
    }

    private void seekToLatestVideoPosition() {
        this.mMediaPlayer.seekTo(this.mLatestVideoPosition);
        logUsedInTests(String.format("MediaPlayer resume : {latestPosition=%d} {currentPosition=%d}", Integer.valueOf(this.mLatestVideoPosition), Integer.valueOf(this.mMediaPlayer.getCurrentPosition())));
        this.mLatestVideoPosition = -1;
    }

    private void startMediaPlayer() {
        logUsedInTests("startMediaPlayer");
        if (this.mLatestVideoPosition >= 0) {
            seekToLatestVideoPosition();
        }
        this.mMediaPlayer.start();
    }

    public void destroyPlayer() {
        if (LOG) {
            Log("destroyPlayer");
        }
        if (!this.mPlaybackPaused) {
            pause();
        }
        doCleanUp();
        mi3 mi3Var = this.mOnBackPressedDispatcher;
        if (mi3Var != null) {
            mi3Var.unregisterOnBackPressedCallback();
            this.mOnBackPressedDispatcher = null;
        }
    }

    public void doCleanUp() {
        Y0 y0 = this._timeoutThread;
        if (y0 != null) {
            y0.b = true;
            this._timeoutThread = null;
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mIsVideoReadyToBePlayed = false;
        this.mIsVideoSizeKnown = false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.mIsURL) {
            return this.mBufferPercentage;
        }
        return 100;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    public boolean isPaused() {
        return this.mPlaybackPaused;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        boolean z = this.mIsVideoReadyToBePlayed && this.mIsVideoSizeKnown;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return !z;
        }
        return mediaPlayer.isPlaying() || !z;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (LOG) {
            Log(pv1.k(i, "onBufferingUpdate percent:"));
        }
        this.mBufferPercentage = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (LOG) {
            Log("onCompletion called");
        }
        destroyPlayer();
        changeState(3);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        MediaController mediaController = this.mMediaController;
        return mediaController != null ? mediaController.onKeyDown(i, keyEvent) : super.onKeyDown(i, keyEvent);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        if (LOG) {
            Log("onPrepared called");
        }
        Y0 y0 = this._timeoutThread;
        if (y0 != null) {
            y0.b = true;
            this._timeoutThread = null;
        }
        int i = this.mControlMode;
        if (i == 0 || i == 1) {
            MediaController mediaController = new MediaController(this.mContext);
            this.mMediaController = mediaController;
            mediaController.setMediaPlayer(this);
            this.mMediaController.setAnchorView(this);
            this.mMediaController.setEnabled(true);
            if (!PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    this.mMediaController.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
                }
            }
            this.mMediaController.show();
        }
        this.mIsVideoReadyToBePlayed = true;
        if (this.mIsVideoSizeKnown) {
            startVideoPlayback();
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (LOG) {
            Log(nj.i(i, i2, "onVideoSizeChanged called ", "x"));
        }
        if (i == 0 || i2 == 0) {
            if (LOG) {
                Log(jc1.n("invalid video width(", i, ") or height(", i2, ")"));
            }
        } else {
            this.mIsVideoSizeKnown = true;
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            if (this.mIsVideoReadyToBePlayed) {
                startVideoPlayback();
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            pauseMediaPlayer();
        }
        this.mPlaybackPaused = true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (LOG) {
            Log("Start");
        }
        if (this.mMediaPlayer == null) {
            return;
        }
        if (this.mSurfaceCreated) {
            startMediaPlayer();
        }
        this.mPlaybackPaused = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (LOG) {
            StringBuilder sbT = jc1.t("surfaceChanged called ", i, " ", i2, "x");
            sbT.append(i3);
            Log(sbT.toString());
        }
        if (this.mSurfaceWidth == i2 && this.mSurfaceHeight == i3) {
            return;
        }
        this.mSurfaceWidth = i2;
        this.mSurfaceHeight = i3;
        if (this.mSurfaceCreated) {
            updateVideoLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (LOG) {
            Log("surfaceCreated called");
        }
        this.mSurfaceCreated = true;
        if (this.mPlaybackPaused) {
            resumeVideoInPauseMode();
        } else {
            playVideo();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (LOG) {
            Log("surfaceDestroyed called");
        }
        this.mSurfaceCreated = false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    public void updateVideoLayout() {
        int i;
        if (LOG) {
            Log("updateVideoLayout");
        }
        if (this.mMediaPlayer == null) {
            return;
        }
        Point pointA = g1.a(this.mContext);
        int i2 = pointA.x;
        if (i2 > 0 && (i = pointA.y) > 0) {
            this.mSurfaceWidth = i2;
            this.mSurfaceHeight = i;
        }
        int i3 = this.mSurfaceWidth;
        int i4 = this.mSurfaceHeight;
        if (this.mIsVideoSizeKnown) {
            int i5 = this.mVideoWidth;
            int i6 = this.mVideoHeight;
            float f = i5 / i6;
            float f2 = i3;
            float f3 = i4;
            float f4 = f2 / f3;
            int i7 = this.mScalingMode;
            if (i7 == 1) {
                if (f4 <= f) {
                    i4 = (int) (f2 / f);
                } else {
                    i3 = (int) (f3 * f);
                }
            } else if (i7 == 2) {
                if (f4 >= f) {
                    i4 = (int) (f2 / f);
                } else {
                    i3 = (int) (f3 * f);
                }
            } else if (i7 == 0) {
                i3 = i5;
                i4 = i6;
            }
        } else if (LOG) {
            Log("updateVideoLayout: Video size is not known yet");
        }
        if (this.mSurfaceWidth == i3 && this.mSurfaceHeight == i4) {
            return;
        }
        if (LOG) {
            Log(nj.i(i3, i4, "frameWidth = ", "; frameHeight = "));
        }
        this.mFrameLayout.updateViewLayout(this.mVideoView, new FrameLayout.LayoutParams(i3, i4, 17));
    }

    public VideoPlayer(Context context, UnityPlayer unityPlayer, String str, int i, int i2, int i3, boolean z, long j, long j2, X0 x0) {
        super(context);
        this.mIsVideoSizeKnown = false;
        this.mIsVideoReadyToBePlayed = false;
        this.mBufferPercentage = 0;
        this.mPlaybackPaused = false;
        this.mLatestVideoPosition = -1;
        this.mSurfaceCreated = false;
        this.mOnBackPressedDispatcher = null;
        this.mState = 0;
        this.mStateCallback = x0;
        this.mContext = context;
        this.mFrameLayout = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.mVideoView = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.mVideoHolder = holder;
        holder.addCallback(this);
        setBackgroundColor(i);
        addView(surfaceView);
        this.mFileName = str;
        this.mControlMode = i2;
        this.mScalingMode = i3;
        this.mIsURL = z;
        this.mVideoOffset = j;
        this.mVideoLength = j2;
        if (LOG) {
            Log(n30.y("fileName: ", str));
        }
        if (LOG) {
            Log(pv1.k(i, "backgroundColor: "));
        }
        if (LOG) {
            Log(pv1.k(i2, "controlMode: "));
        }
        if (LOG) {
            Log(pv1.k(i3, "scalingMode: "));
        }
        if (LOG) {
            Log(h50.j("isURL: ", z));
        }
        if (LOG) {
            Log(jc1.l(j, "videoOffset: "));
        }
        if (LOG) {
            Log(jc1.l(j2, "videoLength: "));
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.mOnBackPressedDispatcher = C5276s.a(unityPlayer.getActivity(), 1000000, new W0(this));
    }

    private void startVideoPlayback() {
        if (!isPlaying()) {
            changeState(1);
            if (LOG) {
                Log("startVideoPlayback");
            }
            updateVideoLayout();
            if (!this.mPlaybackPaused) {
                start();
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (exitOnKeypress(i, keyEvent)) {
            return true;
        }
        MediaController mediaController = this.mMediaController;
        if (mediaController != null) {
            return mediaController.onKeyUp(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.mControlMode == 2 && action == 0) {
            destroyPlayer();
            changeState(3);
            return true;
        }
        MediaController mediaController = this.mMediaController;
        if (mediaController != null) {
            return mediaController.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
