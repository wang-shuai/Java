// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: taochees.proto

package TaocheES;

public interface AggrFieldResultItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TaocheES.AggrFieldResultItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *聚合结果项名称
   * </pre>
   *
   * <code>string TermName = 1;</code>
   */
  java.lang.String getTermName();
  /**
   * <pre>
   *聚合结果项名称
   * </pre>
   *
   * <code>string TermName = 1;</code>
   */
  com.google.protobuf.ByteString
      getTermNameBytes();

  /**
   * <pre>
   *数据条数
   * </pre>
   *
   * <code>int32 Count = 2;</code>
   */
  int getCount();

  /**
   * <pre>
   *二级聚合结果集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; SubAggr = 3;</code>
   */
  int getSubAggrCount();
  /**
   * <pre>
   *二级聚合结果集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; SubAggr = 3;</code>
   */
  boolean containsSubAggr(
      java.lang.String key);
  /**
   * Use {@link #getSubAggrMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSubAggr();
  /**
   * <pre>
   *二级聚合结果集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; SubAggr = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSubAggrMap();
  /**
   * <pre>
   *二级聚合结果集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; SubAggr = 3;</code>
   */

  java.lang.String getSubAggrOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   *二级聚合结果集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; SubAggr = 3;</code>
   */

  java.lang.String getSubAggrOrThrow(
      java.lang.String key);
}
