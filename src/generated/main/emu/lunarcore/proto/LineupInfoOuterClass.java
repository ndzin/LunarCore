// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;
import us.hebi.quickbuf.Utf8String;

public final class LineupInfoOuterClass {
  /**
   * Protobuf type {@code LineupInfo}
   */
  public static final class LineupInfo extends ProtoMessage<LineupInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 index = 5;</code>
     */
    private int index;

    /**
     * <code>optional uint32 max_mp = 6;</code>
     */
    private int maxMp;

    /**
     * <code>optional uint32 mp = 8;</code>
     */
    private int mp;

    /**
     * <code>optional uint32 plane_id = 10;</code>
     */
    private int planeId;

    /**
     * <code>optional uint32 leader_slot = 12;</code>
     */
    private int leaderSlot;

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     */
    private int extraLineupType;

    /**
     * <code>optional bool is_virtual = 14;</code>
     */
    private boolean isVirtual;

    /**
     * <code>optional string name = 3;</code>
     */
    private final Utf8String name = Utf8String.newEmptyInstance();

    /**
     * <code>repeated .LineupAvatar avatar_list = 9;</code>
     */
    private final RepeatedMessage<LineupAvatarOuterClass.LineupAvatar> avatarList = RepeatedMessage.newEmptyInstance(LineupAvatarOuterClass.LineupAvatar.getFactory());

    private LineupInfo() {
    }

    /**
     * @return a new empty instance of {@code LineupInfo}
     */
    public static LineupInfo newInstance() {
      return new LineupInfo();
    }

    /**
     * <code>optional uint32 index = 5;</code>
     * @return whether the index field is set
     */
    public boolean hasIndex() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 index = 5;</code>
     * @return this
     */
    public LineupInfo clearIndex() {
      bitField0_ &= ~0x00000001;
      index = 0;
      return this;
    }

    /**
     * <code>optional uint32 index = 5;</code>
     * @return the index
     */
    public int getIndex() {
      return index;
    }

    /**
     * <code>optional uint32 index = 5;</code>
     * @param value the index to set
     * @return this
     */
    public LineupInfo setIndex(final int value) {
      bitField0_ |= 0x00000001;
      index = value;
      return this;
    }

    /**
     * <code>optional uint32 max_mp = 6;</code>
     * @return whether the maxMp field is set
     */
    public boolean hasMaxMp() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 max_mp = 6;</code>
     * @return this
     */
    public LineupInfo clearMaxMp() {
      bitField0_ &= ~0x00000002;
      maxMp = 0;
      return this;
    }

    /**
     * <code>optional uint32 max_mp = 6;</code>
     * @return the maxMp
     */
    public int getMaxMp() {
      return maxMp;
    }

    /**
     * <code>optional uint32 max_mp = 6;</code>
     * @param value the maxMp to set
     * @return this
     */
    public LineupInfo setMaxMp(final int value) {
      bitField0_ |= 0x00000002;
      maxMp = value;
      return this;
    }

    /**
     * <code>optional uint32 mp = 8;</code>
     * @return whether the mp field is set
     */
    public boolean hasMp() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 mp = 8;</code>
     * @return this
     */
    public LineupInfo clearMp() {
      bitField0_ &= ~0x00000004;
      mp = 0;
      return this;
    }

    /**
     * <code>optional uint32 mp = 8;</code>
     * @return the mp
     */
    public int getMp() {
      return mp;
    }

    /**
     * <code>optional uint32 mp = 8;</code>
     * @param value the mp to set
     * @return this
     */
    public LineupInfo setMp(final int value) {
      bitField0_ |= 0x00000004;
      mp = value;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 10;</code>
     * @return whether the planeId field is set
     */
    public boolean hasPlaneId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 plane_id = 10;</code>
     * @return this
     */
    public LineupInfo clearPlaneId() {
      bitField0_ &= ~0x00000008;
      planeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 10;</code>
     * @return the planeId
     */
    public int getPlaneId() {
      return planeId;
    }

    /**
     * <code>optional uint32 plane_id = 10;</code>
     * @param value the planeId to set
     * @return this
     */
    public LineupInfo setPlaneId(final int value) {
      bitField0_ |= 0x00000008;
      planeId = value;
      return this;
    }

    /**
     * <code>optional uint32 leader_slot = 12;</code>
     * @return whether the leaderSlot field is set
     */
    public boolean hasLeaderSlot() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 leader_slot = 12;</code>
     * @return this
     */
    public LineupInfo clearLeaderSlot() {
      bitField0_ &= ~0x00000010;
      leaderSlot = 0;
      return this;
    }

    /**
     * <code>optional uint32 leader_slot = 12;</code>
     * @return the leaderSlot
     */
    public int getLeaderSlot() {
      return leaderSlot;
    }

    /**
     * <code>optional uint32 leader_slot = 12;</code>
     * @param value the leaderSlot to set
     * @return this
     */
    public LineupInfo setLeaderSlot(final int value) {
      bitField0_ |= 0x00000010;
      leaderSlot = value;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     * @return whether the extraLineupType field is set
     */
    public boolean hasExtraLineupType() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     * @return this
     */
    public LineupInfo clearExtraLineupType() {
      bitField0_ &= ~0x00000020;
      extraLineupType = 0;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     * @return the extraLineupType
     */
    public ExtraLineupTypeOuterClass.ExtraLineupType getExtraLineupType() {
      return ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(extraLineupType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link LineupInfo#getExtraLineupType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getExtraLineupTypeValue() {
      return extraLineupType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ExtraLineupTypeOuterClass.ExtraLineupType}. Setting an invalid value
     * can cause {@link LineupInfo#getExtraLineupType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public LineupInfo setExtraLineupTypeValue(final int value) {
      bitField0_ |= 0x00000020;
      extraLineupType = value;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     * @param value the extraLineupType to set
     * @return this
     */
    public LineupInfo setExtraLineupType(final ExtraLineupTypeOuterClass.ExtraLineupType value) {
      bitField0_ |= 0x00000020;
      extraLineupType = value.getNumber();
      return this;
    }

    /**
     * <code>optional bool is_virtual = 14;</code>
     * @return whether the isVirtual field is set
     */
    public boolean hasIsVirtual() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional bool is_virtual = 14;</code>
     * @return this
     */
    public LineupInfo clearIsVirtual() {
      bitField0_ &= ~0x00000040;
      isVirtual = false;
      return this;
    }

    /**
     * <code>optional bool is_virtual = 14;</code>
     * @return the isVirtual
     */
    public boolean getIsVirtual() {
      return isVirtual;
    }

    /**
     * <code>optional bool is_virtual = 14;</code>
     * @param value the isVirtual to set
     * @return this
     */
    public LineupInfo setIsVirtual(final boolean value) {
      bitField0_ |= 0x00000040;
      isVirtual = value;
      return this;
    }

    /**
     * <code>optional string name = 3;</code>
     * @return whether the name field is set
     */
    public boolean hasName() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional string name = 3;</code>
     * @return this
     */
    public LineupInfo clearName() {
      bitField0_ &= ~0x00000080;
      name.clear();
      return this;
    }

    /**
     * <code>optional string name = 3;</code>
     * @return the name
     */
    public String getName() {
      return name.getString();
    }

    /**
     * <code>optional string name = 3;</code>
     * @return internal {@code Utf8String} representation of name for reading
     */
    public Utf8String getNameBytes() {
      return this.name;
    }

    /**
     * <code>optional string name = 3;</code>
     * @return internal {@code Utf8String} representation of name for modifications
     */
    public Utf8String getMutableNameBytes() {
      bitField0_ |= 0x00000080;
      return this.name;
    }

    /**
     * <code>optional string name = 3;</code>
     * @param value the name to set
     * @return this
     */
    public LineupInfo setName(final CharSequence value) {
      bitField0_ |= 0x00000080;
      name.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string name = 3;</code>
     * @param value the name to set
     * @return this
     */
    public LineupInfo setName(final Utf8String value) {
      bitField0_ |= 0x00000080;
      name.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated .LineupAvatar avatar_list = 9;</code>
     * @return whether the avatarList field is set
     */
    public boolean hasAvatarList() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>repeated .LineupAvatar avatar_list = 9;</code>
     * @return this
     */
    public LineupInfo clearAvatarList() {
      bitField0_ &= ~0x00000100;
      avatarList.clear();
      return this;
    }

    /**
     * <code>repeated .LineupAvatar avatar_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAvatarList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<LineupAvatarOuterClass.LineupAvatar> getAvatarList() {
      return avatarList;
    }

    /**
     * <code>repeated .LineupAvatar avatar_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<LineupAvatarOuterClass.LineupAvatar> getMutableAvatarList() {
      bitField0_ |= 0x00000100;
      return avatarList;
    }

    /**
     * <code>repeated .LineupAvatar avatar_list = 9;</code>
     * @param value the avatarList to add
     * @return this
     */
    public LineupInfo addAvatarList(final LineupAvatarOuterClass.LineupAvatar value) {
      bitField0_ |= 0x00000100;
      avatarList.add(value);
      return this;
    }

    /**
     * <code>repeated .LineupAvatar avatar_list = 9;</code>
     * @param values the avatarList to add
     * @return this
     */
    public LineupInfo addAllAvatarList(final LineupAvatarOuterClass.LineupAvatar... values) {
      bitField0_ |= 0x00000100;
      avatarList.addAll(values);
      return this;
    }

    @Override
    public LineupInfo copyFrom(final LineupInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        index = other.index;
        maxMp = other.maxMp;
        mp = other.mp;
        planeId = other.planeId;
        leaderSlot = other.leaderSlot;
        extraLineupType = other.extraLineupType;
        isVirtual = other.isVirtual;
        name.copyFrom(other.name);
        avatarList.copyFrom(other.avatarList);
      }
      return this;
    }

    @Override
    public LineupInfo mergeFrom(final LineupInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIndex()) {
        setIndex(other.index);
      }
      if (other.hasMaxMp()) {
        setMaxMp(other.maxMp);
      }
      if (other.hasMp()) {
        setMp(other.mp);
      }
      if (other.hasPlaneId()) {
        setPlaneId(other.planeId);
      }
      if (other.hasLeaderSlot()) {
        setLeaderSlot(other.leaderSlot);
      }
      if (other.hasExtraLineupType()) {
        setExtraLineupTypeValue(other.extraLineupType);
      }
      if (other.hasIsVirtual()) {
        setIsVirtual(other.isVirtual);
      }
      if (other.hasName()) {
        getMutableNameBytes().copyFrom(other.name);
      }
      if (other.hasAvatarList()) {
        getMutableAvatarList().addAll(other.avatarList);
      }
      return this;
    }

    @Override
    public LineupInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      index = 0;
      maxMp = 0;
      mp = 0;
      planeId = 0;
      leaderSlot = 0;
      extraLineupType = 0;
      isVirtual = false;
      name.clear();
      avatarList.clear();
      return this;
    }

    @Override
    public LineupInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      name.clear();
      avatarList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof LineupInfo)) {
        return false;
      }
      LineupInfo other = (LineupInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasIndex() || index == other.index)
        && (!hasMaxMp() || maxMp == other.maxMp)
        && (!hasMp() || mp == other.mp)
        && (!hasPlaneId() || planeId == other.planeId)
        && (!hasLeaderSlot() || leaderSlot == other.leaderSlot)
        && (!hasExtraLineupType() || extraLineupType == other.extraLineupType)
        && (!hasIsVirtual() || isVirtual == other.isVirtual)
        && (!hasName() || name.equals(other.name))
        && (!hasAvatarList() || avatarList.equals(other.avatarList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(index);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(maxMp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(mp);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(planeId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(leaderSlot);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 16);
        output.writeEnumNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 112);
        output.writeBoolNoTag(isVirtual);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 26);
        output.writeStringNoTag(name);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        for (int i = 0; i < avatarList.length(); i++) {
          output.writeRawByte((byte) 74);
          output.writeMessageNoTag(avatarList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(index);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(maxMp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mp);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(planeId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(leaderSlot);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(name);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += (1 * avatarList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(avatarList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public LineupInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // index
            index = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // maxMp
            maxMp = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // mp
            mp = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // planeId
            planeId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // leaderSlot
            leaderSlot = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // extraLineupType
            final int value = input.readInt32();
            if (ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(value) != null) {
              extraLineupType = value;
              bitField0_ |= 0x00000020;
            }
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // isVirtual
            isVirtual = input.readBool();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // name
            input.readString(name);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // avatarList
            tag = input.readRepeatedMessage(avatarList, tag);
            bitField0_ |= 0x00000100;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.index, index);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.maxMp, maxMp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.mp, mp);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.planeId, planeId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.leaderSlot, leaderSlot);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeEnum(FieldNames.extraLineupType, extraLineupType, ExtraLineupTypeOuterClass.ExtraLineupType.converter());
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeBool(FieldNames.isVirtual, isVirtual);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeString(FieldNames.name, name);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRepeatedMessage(FieldNames.avatarList, avatarList);
      }
      output.endObject();
    }

    @Override
    public LineupInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 100346066: {
            if (input.isAtField(FieldNames.index)) {
              if (!input.trySkipNullValue()) {
                index = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 103671335:
          case -1081138594: {
            if (input.isAtField(FieldNames.maxMp)) {
              if (!input.trySkipNullValue()) {
                maxMp = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3491: {
            if (input.isAtField(FieldNames.mp)) {
              if (!input.trySkipNullValue()) {
                mp = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -493896553:
          case 1869097438: {
            if (input.isAtField(FieldNames.planeId)) {
              if (!input.trySkipNullValue()) {
                planeId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1191442087:
          case -1708713100: {
            if (input.isAtField(FieldNames.leaderSlot)) {
              if (!input.trySkipNullValue()) {
                leaderSlot = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -468135527:
          case -1144475077: {
            if (input.isAtField(FieldNames.extraLineupType)) {
              if (!input.trySkipNullValue()) {
                final ExtraLineupTypeOuterClass.ExtraLineupType value = input.readEnum(ExtraLineupTypeOuterClass.ExtraLineupType.converter());
                if (value != null) {
                  extraLineupType = value.getNumber();
                  bitField0_ |= 0x00000020;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -113613183:
          case 1966475510: {
            if (input.isAtField(FieldNames.isVirtual)) {
              if (!input.trySkipNullValue()) {
                isVirtual = input.readBool();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3373707: {
            if (input.isAtField(FieldNames.name)) {
              if (!input.trySkipNullValue()) {
                input.readString(name);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -403402345:
          case 397055940: {
            if (input.isAtField(FieldNames.avatarList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(avatarList);
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public LineupInfo clone() {
      return new LineupInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static LineupInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new LineupInfo(), data).checkInitialized();
    }

    public static LineupInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LineupInfo(), input).checkInitialized();
    }

    public static LineupInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LineupInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating LineupInfo messages
     */
    public static MessageFactory<LineupInfo> getFactory() {
      return LineupInfoFactory.INSTANCE;
    }

    private enum LineupInfoFactory implements MessageFactory<LineupInfo> {
      INSTANCE;

      @Override
      public LineupInfo create() {
        return LineupInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName index = FieldName.forField("index");

      static final FieldName maxMp = FieldName.forField("maxMp", "max_mp");

      static final FieldName mp = FieldName.forField("mp");

      static final FieldName planeId = FieldName.forField("planeId", "plane_id");

      static final FieldName leaderSlot = FieldName.forField("leaderSlot", "leader_slot");

      static final FieldName extraLineupType = FieldName.forField("extraLineupType", "extra_lineup_type");

      static final FieldName isVirtual = FieldName.forField("isVirtual", "is_virtual");

      static final FieldName name = FieldName.forField("name");

      static final FieldName avatarList = FieldName.forField("avatarList", "avatar_list");
    }
  }
}
