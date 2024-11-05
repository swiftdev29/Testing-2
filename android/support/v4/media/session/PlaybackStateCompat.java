package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f100a;

    /* renamed from: b  reason: collision with root package name */
    final long f101b;

    /* renamed from: c  reason: collision with root package name */
    final long f102c;

    /* renamed from: d  reason: collision with root package name */
    final float f103d;

    /* renamed from: e  reason: collision with root package name */
    final long f104e;

    /* renamed from: f  reason: collision with root package name */
    final int f105f;

    /* renamed from: q  reason: collision with root package name */
    final CharSequence f106q;

    /* renamed from: r  reason: collision with root package name */
    final long f107r;

    /* renamed from: s  reason: collision with root package name */
    List<CustomAction> f108s;

    /* renamed from: t  reason: collision with root package name */
    final long f109t;

    /* renamed from: u  reason: collision with root package name */
    final Bundle f110u;

    /* renamed from: v  reason: collision with root package name */
    private PlaybackState f111v;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f112a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f113b;

        /* renamed from: c  reason: collision with root package name */
        private final int f114c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f115d;

        /* renamed from: e  reason: collision with root package name */
        private PlaybackState.CustomAction f116e;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f112a = parcel.readString();
            this.f113b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f114c = parcel.readInt();
            this.f115d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f112a = str;
            this.f113b = charSequence;
            this.f114c = i10;
            this.f115d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.f116e = customAction;
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f113b + ", mIcon=" + this.f114c + ", mExtras=" + this.f115d;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f112a);
            TextUtils.writeToParcel(this.f113b, parcel, i10);
            parcel.writeInt(this.f114c);
            parcel.writeBundle(this.f115d);
        }
    }

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f100a = i10;
        this.f101b = j10;
        this.f102c = j11;
        this.f103d = f10;
        this.f104e = j12;
        this.f105f = i11;
        this.f106q = charSequence;
        this.f107r = j13;
        this.f108s = new ArrayList(list);
        this.f109t = j14;
        this.f110u = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f100a = parcel.readInt();
        this.f101b = parcel.readLong();
        this.f103d = parcel.readFloat();
        this.f107r = parcel.readLong();
        this.f102c = parcel.readLong();
        this.f104e = parcel.readLong();
        this.f106q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f108s = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f109t = parcel.readLong();
        this.f110u = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f105f = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction a10 : customActions) {
                arrayList.add(CustomAction.a(a10));
            }
        }
        Bundle extras = playbackState.getExtras();
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras);
        playbackStateCompat.f111v = playbackState;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f100a + ", position=" + this.f101b + ", buffered position=" + this.f102c + ", speed=" + this.f103d + ", updated=" + this.f107r + ", actions=" + this.f104e + ", error code=" + this.f105f + ", error message=" + this.f106q + ", custom actions=" + this.f108s + ", active item id=" + this.f109t + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f100a);
        parcel.writeLong(this.f101b);
        parcel.writeFloat(this.f103d);
        parcel.writeLong(this.f107r);
        parcel.writeLong(this.f102c);
        parcel.writeLong(this.f104e);
        TextUtils.writeToParcel(this.f106q, parcel, i10);
        parcel.writeTypedList(this.f108s);
        parcel.writeLong(this.f109t);
        parcel.writeBundle(this.f110u);
        parcel.writeInt(this.f105f);
    }
}
