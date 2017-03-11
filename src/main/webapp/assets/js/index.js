

var wb = {
		init:function(op){
			
			this.load(op.aid, {current:1});
			
		},
		load:function(aid, param ){
			$.post(this.URL.home(aid),param,function(pi){
				
				var list = $(".w-list").empty();
				
				$.each(pi.list, function(i, item){
					//list.append( )
					wb.weibo(item).appendTo( list );
					
				});
				
				
				
			},"json");
		},
		URL: {
			home:function(aid){
				return "/u/" + aid + "/home";
			}
		},
		weibo:function( w ){
			var weibo = $("<div></div>").addClass("weibo");
			weibo.data("weibo", w);
			var weiboContent = $("<div></div>").addClass("weibo-content");
			$("<img></img>")
				.addClass("header")
				.attr("src", "/assets/image/" + w.account.pic)
				.appendTo( weiboContent );
			
			var h3 = $("<h3></h3>");
				$("<a></a>").html( w.account.nickName ).appendTo( h3 );
			h3.appendTo( weiboContent );
				
			var span = $("<span></span>");
				var span_a1 = $("<a></a>").html( w.weibo.lastUpdateTime );
				var span_a2 = $("<a></a>").html( w.weibo.service );
			span.append( span_a1 )
				.append( "来自" )
				.append( span_a2 )
				.appendTo( weiboContent );
			
			$("<p></p>").html( w.weibo.wcontent + "_Ajax" ).appendTo( weiboContent );
			
			var ul = $("<ul></ul>").addClass("clearfix");
			
			$('<li><a href=""><i class="icon-star-empty"></i><span>收藏</span></a></li>').appendTo( ul);
			$('<li><a href=""><i class=" icon-share"></i><span>0</span></a></li>').appendTo(ul);
			$('<li><a class="comment" href=""><i class="icon-comment-alt"></i><span>' + w.weibo.comment +'</span></a></li>')
				.appendTo( ul );
			
			var li4 = $('<li></li>').addClass('last');
				var li4_a = $('<a></a>');
				if( w.flag == w.account.aid ){
					li4_a.addClass('liked');
				}
			$('<i class="icon-thumbs-up"></i><span>' + w.weibo.liked + '</span>').appendTo( li4_a );
			li4.append( li4_a ).appendTo( ul );
			
			weibo.append(weiboContent).append( ul );
			
			return weibo;
		}
};