package android.media.metrics;

import android.annotation.NonNull;

public final /* synthetic */ class PlaybackErrorEvent$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ PlaybackErrorEvent build();

    @NonNull
    public native /* synthetic */ PlaybackErrorEvent$Builder setErrorCode(int i10);

    @NonNull
    public native /* synthetic */ PlaybackErrorEvent$Builder setException(@NonNull Exception exc);

    @NonNull
    public native /* synthetic */ PlaybackErrorEvent$Builder setSubErrorCode(int i10);

    @NonNull
    public native /* synthetic */ PlaybackErrorEvent$Builder setTimeSinceCreatedMillis(long j10);
}
