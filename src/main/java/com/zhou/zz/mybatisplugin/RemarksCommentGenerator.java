package com.zhou.zz.mybatisplugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

/**
 * 生成字段添加注释信息重写类
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午6:15:13
 */
public class RemarksCommentGenerator extends DefaultCommentGenerator {

	@Override
	public void addFieldComment(Field field, IntrospectedTable table, IntrospectedColumn column) {
		String remark = column.getRemarks();
		String columnName = column.getActualColumnName();
		List<IntrospectedColumn> primaryKey = table.getPrimaryKeyColumns();
		for (IntrospectedColumn introspectedColumn : primaryKey) {
			if (columnName.equals(introspectedColumn.getActualColumnName())) {
				remark += " (主键ID)";
				continue;
			}
			if (StringUtility.stringHasValue(remark)) {
				remark += column.isNullable() ? "(可选项)" : "(必选项)";
			}
		}
		String defaultValue = column.getDefaultValue();
		remark += null != defaultValue ? "（默认值为" + defaultValue + "）" : "（无默认值）";
		field.addJavaDocLine("/** " + remark + " */");
	}

	@Override
	public void addModelClassComment(TopLevelClass arg0, IntrospectedTable arg1) {
		super.addModelClassComment(arg0, arg1);
	}

}
