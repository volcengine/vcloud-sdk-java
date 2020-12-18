// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.model.vod.business;

public interface VodMediaInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Business.VodMediaInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *视频基础信息
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodMediaBasicInfo BasicInfo = 1;</code>
   * @return Whether the basicInfo field is set.
   */
  boolean hasBasicInfo();
  /**
   * <pre>
   *视频基础信息
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodMediaBasicInfo BasicInfo = 1;</code>
   * @return The basicInfo.
   */
  com.volcengine.model.vod.business.VodMediaBasicInfo getBasicInfo();
  /**
   * <pre>
   *视频基础信息
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodMediaBasicInfo BasicInfo = 1;</code>
   */
  com.volcengine.model.vod.business.VodMediaBasicInfoOrBuilder getBasicInfoOrBuilder();

  /**
   * <pre>
   *原视频信息
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodSourceInfo SourceInfo = 2;</code>
   * @return Whether the sourceInfo field is set.
   */
  boolean hasSourceInfo();
  /**
   * <pre>
   *原视频信息
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodSourceInfo SourceInfo = 2;</code>
   * @return The sourceInfo.
   */
  com.volcengine.model.vod.business.VodSourceInfo getSourceInfo();
  /**
   * <pre>
   *原视频信息
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodSourceInfo SourceInfo = 2;</code>
   */
  com.volcengine.model.vod.business.VodSourceInfoOrBuilder getSourceInfoOrBuilder();

  /**
   * <pre>
   *转码视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodTranscodeInfo TranscodeInfos = 3;</code>
   */
  java.util.List<com.volcengine.model.vod.business.VodTranscodeInfo> 
      getTranscodeInfosList();
  /**
   * <pre>
   *转码视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodTranscodeInfo TranscodeInfos = 3;</code>
   */
  com.volcengine.model.vod.business.VodTranscodeInfo getTranscodeInfos(int index);
  /**
   * <pre>
   *转码视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodTranscodeInfo TranscodeInfos = 3;</code>
   */
  int getTranscodeInfosCount();
  /**
   * <pre>
   *转码视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodTranscodeInfo TranscodeInfos = 3;</code>
   */
  java.util.List<? extends com.volcengine.model.vod.business.VodTranscodeInfoOrBuilder> 
      getTranscodeInfosOrBuilderList();
  /**
   * <pre>
   *转码视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodTranscodeInfo TranscodeInfos = 3;</code>
   */
  com.volcengine.model.vod.business.VodTranscodeInfoOrBuilder getTranscodeInfosOrBuilder(
      int index);
}