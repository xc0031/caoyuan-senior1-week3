<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2019年11月18日</title>
<script type="text/javascript" src="/resources/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=path%>/resources/js/jquery.validate.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=path%>/resources/js/My97DatePicker/WdatePicker.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.min.css" />
<script type="text/javascript">
	//按规模
	function gm(p1, p2) {
		$("[name='p1']").val(p1);
		$("[name='p2']").val(p2);
		if ('${vo.types.size()}' > 0) {
			location = "companys?" + $("#form1").serialize() + "&types=1,2,3";
		} else {
			location = "companys?" + $("#form1").serialize();
		}
	}
	//按类型
	function lx(type) {
		$("[name='type']").val(type);
		location = "companys?" + $("#form1").serialize();
	}
	//按其它
	function qt() {
		$("[name='type']").val("");
		location = "companys?" + $("#form1").serialize() + "&types=1,2,3";
	}
	//分页
	function goPage(pageNum) {
		if ('${vo.types.size()}' > 0) {
			location = "companys?" + $("#form1").serialize() + "&types=1,2,3&pageNum="+pageNum;
		} else {
			location = "companys?" + $("#form1").serialize()+"&pageNum="+pageNum;
		}
	}
</script>
</head>
<body>
	<div style="width: 100%; margin-top: 30px" class="container">
		<h3 style="text-align: center;">公司管理页面</h3>
		<!-- 导航,查询条件-->
		<ul class="nav nav-tabs">
			<li class="nav-item">
				<a href="#" class="nav-link">按规模</a>
			</li>
			<li class="nav-item">
				<a href="#" class="nav-link ${vo.p1==1?'active':'' }" onclick="gm(1,2000000)">小型企业</a>
			</li>
			<li class="nav-item">
				<a href="#" class="nav-link ${vo.p1==2000001?'active':'' }" onclick="gm(2000001,10000000)">中型企业</a>
			</li>
			<li class="nav-item">
				<a href="#" class="nav-link ${vo.p1==10000000?'active':'' }" onclick="gm(10000000,2100000000)">大型企业</a>
			</li>
			<li class="nav-item">
				<a href="#" class="nav-link ${vo.p1==null?'active':'' }" onclick="gm('','')">全部</a>
			</li>
		</ul>
		<ul class="nav nav-tabs">
			<li class="nav-item">
				<a href="#" class="nav-link">按类型</a>
			</li>
			<li class="nav-item">
				<a href="#" class="nav-link ${vo.type==1?'active':'' }" onclick="lx(1)">有限公司</a>
			</li>
			<li class="nav-item">
				<a href="#" class="nav-link ${vo.type==2?'active':'' }" onclick="lx(2)">股份公司</a>
			</li>
			<li class="nav-item">
				<a href="#" class="nav-link ${vo.type==3?'active':'' }" onclick="lx(3)">国企</a>
			</li>
			<li class="nav-item">
				<a href="#" class="nav-link ${vo.types.size()>0?'active':'' }" onclick="qt()">其它</a>
			</li>
			<li class="nav-item">
				<a href="#" class="nav-link ${(vo.type==null and !(vo.types.size()>0))?'active':'' }" onclick="lx('')">全部</a>
			</li>
		</ul>
		<!-- 隐藏域传值 -->
		<form id="form1">
			<input type="hidden" name="p1" value="${vo.p1 }">
			<input type="hidden" name="p2" value="${vo.p2 }">
			<input type="hidden" name="type" value="${vo.type }">
		</form>
		<!-- 表格 -->
		<table class="table table-hover table-bordered" style="text-align: center;">
			<thead class="table-info">
				<tr>
					<th>公司名称</th>
					<th>营业执照号</th>
					<th>法人代表</th>
					<th>注册资金</th>
					<th>公司类型</th>
					<th>成立日期</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${page.list }" var="c">
					<tr>
						<td>${c.name }</td>
						<td>${c.registNo }</td>
						<td>${c.corporation }</td>
						<td>${c.capital }</td>
						<td>${c.type2.name }</td>
						<td>
							<fmt:formatDate value="${c.created }" pattern="yyyy-MM-dd"/>
						</td>
						<td>
							<button type="button" class="btn btn-info" onclick="">详情</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="container">
			<ul class="pagination justify-content-center">
				<li class="page-item">
					<a class="page-link" href="#" onclick="goPage(${page.prePage==0?1:page.prePage })">上一页</a>
				</li>
				<c:forEach items="${page.navigatepageNums }" var="n">
					<li class="page-item ${page.pageNum==n?'active':'' }">
						<a class="page-link" href="#" onclick="goPage(${n })">${n }</a>
					</li>
				</c:forEach>
				<li class="page-item">
					<a class="page-link" href="#" onclick="goPage(${page.nextPage==0?1:page.nextPage })">下一页</a>
				</li>
			</ul>
		</div>
		<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
	</div>
</body>
</html>