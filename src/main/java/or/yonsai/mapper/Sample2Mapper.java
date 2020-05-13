package or.yonsai.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample2Mapper {
	
	@Insert("insert into sample_db.tbl_sample2 (col2) values (#{data}) ")
	public int insertCol2(String data);

}
