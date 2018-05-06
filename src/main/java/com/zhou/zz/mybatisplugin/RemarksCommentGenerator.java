package com.zhou.zz.mybatisplugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

/**
 * �����ֶ����ע����Ϣ��д��
 * 
 * @author Mr.Zhou
 * @datatime 2018��4��8������6:15:13
 */
public class RemarksCommentGenerator extends DefaultCommentGenerator {

	@Override
	public void addFieldComment(Field field, IntrospectedTable table, IntrospectedColumn column) {
		String remark = column.getRemarks();
		String columnName = column.getActualColumnName();
		List<IntrospectedColumn> primaryKey = table.getPrimaryKeyColumns();
		for (IntrospectedColumn introspectedColumn : primaryKey) {
			if (columnName.equals(introspectedColumn.getActualColumnName())) {
				remark += " (����ID)";
				continue;
			}
			if (StringUtility.stringHasValue(remark)) {
				remark += column.isNullable() ? "(��ѡ��)" : "(��ѡ��)";
			}
		}
		String defaultValue = column.getDefaultValue();
		remark += null != defaultValue ? "��Ĭ��ֵΪ" + defaultValue + "��" : "����Ĭ��ֵ��";
		field.addJavaDocLine("/** " + remark + " */");
	}

	@Override
	public void addModelClassComment(TopLevelClass arg0, IntrospectedTable arg1) {
		super.addModelClassComment(arg0, arg1);
	}

}
